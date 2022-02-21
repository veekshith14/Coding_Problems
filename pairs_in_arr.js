function findNumOfPair(){
    let ar=[10,20,30,10,20,20,30,50,20,10,20];
    let count=0;
    for(var i=0;i<ar.length;i++){
        for(var j=i+1;j<ar.length;j++){
            if(ar[i]==ar[j]){
                count++;
                ar.splice(j,1);
                break
            }
        }

    }
    return count;
}

let result=findNumOfPair();
console.log(result);