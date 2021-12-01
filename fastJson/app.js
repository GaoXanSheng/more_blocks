const fs = require('fs');
const mod = "more_blocks"
const data = ["leaf","test_block","b","bl","g","gg","o","r","w","x","y"]
for(let i =0;i<data.length;i++){
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/blockstates/${data[i]}.json`,JSON.stringify(
    {
        "variants": {
            "normal": { "model": `${mod}:${data[i]}` }
        }
    }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/models/block/${data[i]}.json`,JSON.stringify(
        {
            "parent": "block/cube_all",
            "textures": {
              "all": `${mod}:blocks/${data[i]}`
            }
          }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/models/item/${data[i]}.json`,JSON.stringify(
    {
      "parent": `${mod}:block/${data[i]}`
    }
    ))
}