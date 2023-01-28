
// let admin=JSON.parse(localStorage.getItem("admin"))
// if(admin==null){
//     alert("please login")
//   window.location.href="index.html"
// }

async function addCat(){
    // let key=document.getElementById("key").value;
    let key=admin.uuid;
    let cat_data={
        name:document.getElementById("catname").value,
    }
    
    cat_data=JSON.stringify(cat_data)
    
    let api_link=`http://localhost:8888/category/add${key}`
    let response=await fetch(api_link,{
        method:"POST",
        body:cat_data,
        headers:{
            'Content-Type':'application/json'
        }
    })
    let data=await response.json()
    console.log(data)

    if(data.message!=null){
        alert(data.message);
    }
    else{
        alert("categoryId: "+data.categoryId+" name: "+data.name+" added successfully");
    }
}


async function viewAllCat(){

     fetch('http://localhost:8888/category/all')
    .then((response) => response.json())
    .then((data) => displayData1(data));

    // http://localhost:8888/product/viewAllProduct
}


async function viewCatById(){
    let key=document.getElementById("catId").value;

    fetch(`http://localhost:8888/category/view/${key}`)
    .then((response) => response.json())
    .then((data) => fc(data));

    function fc(data){
        if(data.message!=null){
            alert(data.message);
        }
        else{
            alert("categoryId: "+data.categoryId+" name: "+data.name+" total products: "+data.products.length);
        }
    }
}


async function viewProductByCat(){
    let key=document.getElementById("catId1").value;

    fetch(`http://localhost:8888/category/viewProductByCategory/${key}`)
    .then((response) => response.json())
    .then((data) => displayData2(data));
}


async function deleteCat(){
    let key=document.getElementById("catId2").value;
    let uuid=admin.uuid;

    let api_link=`http://localhost:8888/category/delete/${key}/${uuid}`
    let response=await fetch(api_link,{
        method:"DELETE",
        headers:{
            'Content-Type':'application/json'
        }
    })
    let data=await response.json()
    if(data.message!=null){
        alert(data.message);
    }
    else{
        alert("categoryId: "+data.categoryId+" name: "+data.name+" deleted successfully");
    }
    
}



function displayData2(data){

     let cont=document.getElementById("display")
     cont.innerHTML=null;
     
     let table=document.createElement("table");
     let p=document.createElement("h1");
     p.setAttribute("class","proCat")
     p.innerText="Products"
     
     let thead=document.createElement("thead");
     
     let tr1=document.createElement("tr");
     
     let th0=document.createElement("th");
     th0.innerText="Image"
     let th1=document.createElement("th");
     th1.innerText="Id";
     let th2=document.createElement("th");
     th2.innerText="Name"
     
     let th3=document.createElement("th");
     th3.innerText="Price"
     let th4=document.createElement("th");
     th4.innerText="Quantity"
     let th5=document.createElement("th");
     th5.innerText="Rating"
     
     
     tr1.append(th0,th1,th2,th3,th4,th5);
     thead.append(tr1);
     
     let tbody=document.createElement("tbody");
     tbody.setAttribute("id","tab1")
     table.append(thead,tbody)
     cont.append(p,table);
     
     data.forEach(function(ele){
         let tr=document.createElement("tr")
         let td1=document.createElement("td")
         td1.innerText=ele.productId;
         let td2=document.createElement("td")
         td2.innerText=ele.productName
     
         let td3=document.createElement("td")
         td3.innerText=ele.price;
         let td4=document.createElement("td")
         td4.innerText=ele.quantity
         let td5=document.createElement("td")
         td5.innerText=ele.rating
     
         let td0=document.createElement("td")
         let img=document.createElement("img")
         img.setAttribute("src",ele.url)
         td0.append(img)
         
         tr.append(td0,td1,td2,td3,td4,td5)
         document.getElementById("tab1").append(tr)
         
     });
     
     
     }
     
     // function displayData1(ele){
     
     // let cont=document.getElementById("display")
     // cont.innerHTML=null;
     
     // let table=document.createElement("table");
     // let p=document.createElement("p");
     // p.setAttribute("class","proCat")
     // p.innerText="Product"
     
     // let thead=document.createElement("thead");
     
     // let tr1=document.createElement("tr");
     
     // let th0=document.createElement("th");
     // th0.innerText="Image"
     // let th1=document.createElement("th");
     // th1.innerText="Id";
     // let th2=document.createElement("th");
     // th2.innerText="Name"
     
     // let th3=document.createElement("th");
     // th3.innerText="Price"
     // let th4=document.createElement("th");
     // th4.innerText="Quantity"
     // let th5=document.createElement("th");
     // th5.innerText="Rating"
     
     
     // tr1.append(th0,th1,th2,th3,th4,th5);
     // thead.append(tr1);
     
     // let tbody=document.createElement("tbody");
     // tbody.setAttribute("id","tab1")
     // table.append(thead,tbody)
     // cont.append(p,table);
     
     // // data.forEach(function(ele){
     //     let tr=document.createElement("tr")
     //     let td1=document.createElement("td")
     //     td1.innerText=ele.productId;
     //     let td2=document.createElement("td")
     //     td2.innerText=ele.productName
     
     //     let td3=document.createElement("td")
     //     td3.innerText=ele.price;
     //     let td4=document.createElement("td")
     //     td4.innerText=ele.quantity
     //     let td5=document.createElement("td")
     //     td5.innerText=ele.rating
     
     //     let td0=document.createElement("td")
     //     let img=document.createElement("img")
     //     img.setAttribute("src",ele.url)
     //     td0.append(img)
         
     //     tr.append(td0,td1,td2,td3,td4,td5)
     //     document.getElementById("tab1").append(tr)
         
     // // });
     
     
     // }











function displayData1(data){

    let cont=document.getElementById("display")
    cont.innerHTML=null;
    
    let table=document.createElement("table");
    let p=document.createElement("p");
    p.setAttribute("class","proCat")
    p.innerText="Product Categories"

    let thead=document.createElement("thead");
    let tr1=document.createElement("tr");
    let th1=document.createElement("th");
    th1.innerText="Id";
    let th2=document.createElement("th");
    th2.setAttribute("class","mid")
    th2.innerText="Name"
    let th3=document.createElement("th");
    th3.innerText="Total Products"
    tr1.append(th1,th2,th3);
    thead.append(tr1);
    let tbody=document.createElement("tbody");
    tbody.setAttribute("id","tab1")
    table.append(thead,tbody)
    cont.append(p,table);

    data.forEach(function(ele){
        let tr=document.createElement("tr")
        let td1=document.createElement("td")
        td1.innerText=ele.categoryId;
        let td2=document.createElement("td")
        td2.setAttribute("class","mid")
        td2.innerText=ele.name
        let td3=document.createElement("td")
        td3.innerText=ele.products.length
        
        tr.append(td1,td2,td3)
        document.getElementById("tab1").append(tr)
        
    });

}


// function displayData2(data){

//     let cont=document.getElementById("display")
//     cont.innerHTML=null;
    
//     let table=document.createElement("table");
//     let p=document.createElement("p");
//     p.setAttribute("class","proCat")
//     p.innerText="Products"

//     let thead=document.createElement("thead");
    
//     let tr1=document.createElement("tr");

//     let th0=document.createElement("th");
//     th0.innerText="Image"
//     let th1=document.createElement("th");
//     th1.innerText="Id";
//     let th2=document.createElement("th");
//     th2.innerText="Name"
//     let th3=document.createElement("th");
//     th3.innerText="Price"
//     let th4=document.createElement("th");
//     th4.innerText="Quantity"
//     let th5=document.createElement("th");
//     th5.innerText="Rating"

//     tr1.append(th0,th1,th2,th3,th4,th5);
//     thead.append(tr1);

//     let tbody=document.createElement("tbody");
//     tbody.setAttribute("id","tab1")
//     table.append(thead,tbody)
//     cont.append(p,table);

//     data.forEach(function(ele){
//         let tr=document.createElement("tr")
//         let td1=document.createElement("td")
//         td1.innerText=ele.productId;

//         let td2=document.createElement("td")
//         td2.innerText=ele.productName

      
//         let td3=document.createElement("td")
//         td3.innerText=ele.price;
//         let td4=document.createElement("td")
//         td4.innerText=ele.quantity

//         let td5=document.createElement("td")
//         td5.innerText=ele.rating

//         let td0=document.createElement("td")
//         let url=document.createElement("img")
//         img.setAttribute("src",ele.url)
//         td0.append(img)
        
//         tr.append(td0,td1,td2,td3,td4,td5)
//         document.getElementById("tab1").append(tr)
        
//     });


// }
