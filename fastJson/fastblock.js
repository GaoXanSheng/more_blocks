const fs = require('fs');
const mod = "more_blocks"
function DirData() {
  return new Promise((res, rej) => {
    fs.readdir(`../src/generated/resources/assets/${mod}/textures/blocks`, (e, r) => {
      if (e) rej(e);
      res(r)
    })
  })
}

DirData().then(r => {
  let data = r.map(x => x.substring(0, x.length - 4))
  console.log(data);
  console.log(data.length);
  for (let i = 0; i < data.length; i++) {
    fs.writeFileSync(`../src/generated/resources/assets/${mod}/blockstates/${data[i]}.json`, JSON.stringify(
      {
        "variants": {
          "normal": [
            { "model": `${mod}:${data[i]}` },
            { "model": `${mod}:${data[i]}`, "y": 90 },
            { "model": `${mod}:${data[i]}`, "y": 180 },
            { "model": `${mod}:${data[i]}`, "y": 270 }
          ]
        }
      }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/${mod}/models/block/${data[i]}.json`, JSON.stringify(
      {
        "parent": "block/cube_all",
        "textures": {
          "all": `${mod}:blocks/${data[i]}`
        }
      }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/${mod}/models/item/${data[i]}.json`, JSON.stringify(
      {
        "parent": `${mod}:block/${data[i]}`
      }
    ))
  }
})
