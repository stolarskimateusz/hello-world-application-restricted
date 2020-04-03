require 'uri'
require 'net/http'
require 'openssl'

# replace with your actual key
apikey = "YOUR-APIKEY"

url = URI("https://sandbox.api.service.nhs.uk/hello/application")

http = Net::HTTP.new(url.host, url.port)
http.use_ssl = true
http.verify_mode = OpenSSL::SSL::VERIFY_NONE

request = Net::HTTP::Get.new(url)
request["apikey"] = apikey

response = http.request(request)
puts response.read_body
