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
  let tmp = []
  for(i of data){
    tmp.push(`public static final Block ${i} = new FastBlock("${i}");`)
  }
  for(i of tmp){
      console.log(i);
  }
  
})