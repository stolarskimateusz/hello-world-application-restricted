using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Net.Http.Headers;


namespace dotnetapi
{
    class Program
    {
        static async System.Threading.Tasks.Task Main(string[] args)
        {
            // replace below api key with obtained by you
            string apikey = "EHdHHobw2sEMZ1Aokk9KaoFKCYsLNmWI";
            string url = "https://sandbox.api.service.nhs.uk/hello/application";

            HttpClient client = new HttpClient();
            client.DefaultRequestHeaders.Add("apikey", apikey);
            client.DefaultRequestHeaders.Add("accept", "application/json");

            HttpResponseMessage response = await client.GetAsync(url);

            response.EnsureSuccessStatusCode();

            var responseString = response.Content.ReadAsStringAsync().Result;
            
            Console.WriteLine(responseString);

            
        }
    }
}



