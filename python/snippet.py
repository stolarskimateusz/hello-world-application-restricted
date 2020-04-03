import requests

APIKEY = 'YOUR-APIKEY'  # replace with your actual key

response = requests.get(
    "https://sandbox.api.service.nhs.uk/hello/application",
    headers={'apikey': APIKEY}
)
print(response.json())
