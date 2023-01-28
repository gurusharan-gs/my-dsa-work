
// let admin=JSON.parse(localStorage.getItem("admin"))
// if(admin==null){
//     alert("please login")
//   window.location.href="index.html"
// }

async function addProduct(){

    let key=admin.uuid;
    let cat_id=document.getElementById("catid").value;

    let pro_data={
        productName:document.getElementById("name").value,
        description:document.getElementById("desc").value,
        price:document.getElementById("price").value,
        quantity:document.getElementById("quan").value,
        url:document.getElementById("url").value,
        rating: 0,
    }
    
    pro_data=JSON.stringify(pro_data)
    
    let api_link=`ttp://localhost:8888/product/${cat_id}`
    let response=await fetch(api_link,{
        method:"POST",
        body:pro_data,
        headers:{
            'Content-Type':'application/json'
        }
    })
    let data=await response.json()

    if(data.message!=null){
        alert(data.message);
    }
    else{
        displayData1(data)
    }
}

async function deletePro(){
    let key=document.getElementById("proId2").value;
    let uuid=admin.uuid;

    let api_link=`http://localhost:8888/product/delete/${key}`
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
        displayData1(data)
    }
    
}

async function viewAllPro(){

fetch('http://localhost:8888/product/list')
.then((response) => response.json())
.then((data) => displayData2(data));

}


async function viewProByName(){
    let key=document.getElementById("pro").value;

    fetch(`http://localhost:8888/product/productByName/${key}`)
    .then((response) => response.json())
    .then((data) => displayData2(data));
}

async function viewProById(){
    let key=document.getElementById("proId").value;

    fetch(`http://localhost:8888/product/get/${key}`)
    .then((response) => response.json())
    .then((data) => displayData1(data));
}

async function updateProduct(){

let key=admin.uuid;

let pro_data={
    productId:document.getElementById("proId1").value,
    productName:document.getElementById("name1").value,
    description:document.getElementById("desc1").value,
    price:document.getElementById("price1").value,
    quantity:document.getElementById("quan1").value,
    url:document.getElementById("url1").value,
}

pro_data=JSON.stringify(pro_data)

let api_link=`http://localhost:8888/product/update/${key}`
let response=await fetch(api_link,{
    method:"PUT",
    body:pro_data,
    headers:{
        'Content-Type':'application/json'
    }
})
let data=await response.json()


if(data.message!=null){
    alert(data.message);
}
else{
    displayData1(data)
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

function displayData1(ele){

let cont=document.getElementById("display")
cont.innerHTML=null;

let table=document.createElement("table");
let p=document.createElement("p");
p.setAttribute("class","proCat")
p.innerText="Product"

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

// data.forEach(function(ele){
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
    
// });


}
