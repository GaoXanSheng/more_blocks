const fs = require('fs');
const data = ["leaf","test_block","b","bl","g","gg","o","r","w","x","y"]
for(let i =0;i<data.length;i++){
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/blockstates/${data[i]}.json`,JSON.stringify(
    {
        "variants": {
            "normal": { "model": "more_blocks:"+`${data[i]}` }
        }
    }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/models/block/${data[i]}.json`,JSON.stringify(
        {
            "parent": "block/cube_all",
            "textures": {
              "all": "more_blocks:block/"+`${data[i]}`
            }
          }
    ))
    fs.writeFileSync(`../src/generated/resources/assets/more_blocks/models/item/${data[i]}.json`,JSON.stringify(
        {
            "parent": "more_blocks:block/"+`${data[i]}`
          }
    ))
}