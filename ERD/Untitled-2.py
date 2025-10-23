# --- Comentario una linea ---
# print("Hola, mi nombre es Jordi")

# --- Comentario seleccion diferentes lineas---
"""print("String 1") # First String
print("String 2") # Second String
print("String 3") # Third String

x = 7
y = x * 2

y = "Hola"


x = str(3)
y = int(3)
z = float(3)

print(y[1:3])

age = 25

print("Age is", age)

mylist = ["manzana", "limon"]
mylist.insert(0,"naranja")
mylist.pop()
print(mylist)
"""
'''
import pandas as pd
import numpy as np
import json
import requests

data= {
    "name": ["Alice", "Bob", "Charlie", "Alicia",""],
    "age" : [25,30,35,26.0],
    "city": ["New York", "Paris","London", "New York"]
}

#dataframe

df = pd.DataFrame(data)'''


import json
import requests

'''url = "https://jsonplaceholder.typicode.com/posts"

params = {"userId": 6}

response = requests.get(url, params=params)

if response.status_code == 200:
    data = response.json()
    print(f"Retrieved {len(data)} posts.")
else:
    print(f"Error: {response.status_code}")
    
with open("my_data_json", "w") as f:
    json.dump(data, f, indent=4)'''
    
'''url = "https://api.nasa.gov/neo/rest/v1/feed"
params = {
    "api_key": "5PSwWvk0Fjbg66NTlgG3WKPGVUjSYG2WGqB6NCxx",
    "start_date": "2022-10-01"
}


response = requests.get(url, params=params)

if response.status_code == 200:
    json_data = response.json()
    print("Json data retrieved successfully.")
#    print("Raw XML Start", json_data[:10])
else:
    print(f"Error: {response.status_code}")
    
with open("asteroid.json", "w") as f:
    json.dump(json_data, f, indent=4)'''
    
    
    
import xml.etree.ElementTree as ET
try: 
    url = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.xml"
    
    response = requests.get(url)
    
    response.raise_for_status()
    response.status_code
    print("Status code:", response.status_code)
    print("Content Type:", response.headers.get("content-type"))
    
except requests.exceptions.RequestException as e:
    print(f"Error fetching data: {e}")
except ET.ParseError as e:
    print(f"Error fetching XML: {e}")