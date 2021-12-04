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
DirData().then(r=>{
  let data = r.map(x => x.substring(0, x.length - 4))
  let tmp = [`itemGroup.${mod}=${mod}`]
  for(let i of data){
    tmp.push(`\ntile.${i}.name=${i}`)
  }
  data = ''
  for(let i = 0;i<tmp.length;i++){
      data +=tmp[i]
  }
  console.log(data);
    fs.writeFileSync(`../src/generated/resources/assets/${mod}/lang/en_us.lang`,data,e=>{if(e)console.log(e);})
})