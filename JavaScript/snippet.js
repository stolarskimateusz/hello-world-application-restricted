// replace with your actual key
const apikey = "YOUR-APIKEY"

const url = "https://sandbox.api.service.nhs.uk/hello/application"

fetch(
    url,
    {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'apikey': apikey,
        }
    }
)
.then(resp => resp.json())
.then((data) => {
    console.log(data);
})
.catch((error) => {
    console.error(error);
});
