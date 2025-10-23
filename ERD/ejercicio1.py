import json
import xml.etree.ElementTree as ET


with open("artist.json") as archivo:
    datos = json.load(archivo)
performances = datos["performances"]
scorePerformance = [x for x in performances if x["popularity_score"] >= 7.0]

## ---------------------------------------------------------------------




tree = ET.parse("venues.xml")
root = tree.getroot()

venue_dictionary = {}

for item in root.findall("venues/venue"):
    artist_id = item.find("artist_id").text
    capacity = int(item.find("capacity").text)
    tickets_sold = int(item.find("tickets_sold").text)
    
    venue_dictionary[artist_id] = {
        "stage_name": item.find("stage_name").text,
        "capacity": capacity,
        "tickets_sold": tickets_sold,
        "ticket_price": float(item.find("ticket_price").text),
        "occupancy_rate": round((tickets_sold / capacity) * 100, 2), 
    }
'''


## ---------------------------------------------------------------------
    
print(scorePerformance)

print("\n\n" + "=" * 60 + "\n")
        
print( venue_dictionary["A001"]["stage_name"] )

print("\n\n" + "=" * 60 + "\n")

## ---------------------------------------------------------------------

combinado = []

for item in performances:
    artist_id = item['artist_id']

    if artist_id in venue_dictionary:
        venue_info = venue_dictionary[artist_id]

        occupancy = venue_info['occupancy_rate']
        if occupancy >= 99:
            status ="SOLD OUT"
        elif occupancy >= 86:
            status = "HIGH DEMAND"
        else:
            status = "AVAILABLE"

        combinado_item = { 
            'artist_id': artist_id,
            'artist_name': item['artist_name'],
            'genre': item['genre'],
            'day': item['day'],
            'time': item['time'],
            'duration_minutes': item ['duration_minutes'],
            'popularity_score': item['popularity_score'],
            'stage_name': venue_info['stage_name'],
            'capacity': venue_info['capacity'],
            'tickets_sold': venue_info['tickets_sold'],
            'occupancy_rate': venue_info['occupancy_rate'],
            'ticket_price': venue_info['ticket_price'],
            'revenue': round(venue_info['tickets_sold'] * venue_info['ticket_price'],2 ),
            'status': status
        }
        combinado.append(combinado_item)

print(combinado)'''
    



## ---------------------------------------------------------------------


def datos_combinados(performances, venue_dictionary):
    combinado = []

    for item in performances:
        artist_id = item['artist_id']

        if artist_id in venue_dictionary:
            venue_info = venue_dictionary[artist_id]

            occupancy = venue_info['occupancy_rate']
            if occupancy >= 99:
                status ="SOLD OUT"
            elif occupancy >= 86:
                status = "HIGH DEMAND"
            else:
                status = "AVAILABLE"

            
            combinado_item = { 
                'artist_id': artist_id,
                'artist_name': item['artist_name'],
                'genre': item['genre'],
                'day': item['day'],
                'time': item['time'],
                'duration_minutes': item ['duration_minutes'],
                'popularity_score': item['popularity_score'],
                'stage_name': venue_info['stage_name'],
                'capacity': venue_info['capacity'],
                'tickets_sold': venue_info['tickets_sold'],
                'occupancy_rate': venue_info['occupancy_rate'],
                'ticket_price': venue_info['ticket_price'],
                'revenue': round(venue_info['tickets_sold'] * venue_info['ticket_price'],2 ),
                'status': status
            }
            combinado.append(combinado_item)
            
    return combinado

combinado_data = datos_combinados(performances, venue_dictionary)

def filter_high_priority(combinado_data):
    high_priority = [
        item for item in combinado_data
        if item['status'] in ['SOLD OUT', 'HIGH DEMAND']
        or item['popularity_score'] >= 8.0
        or item['revenue'] >= 300000
    ]
    
    high_priority.sort(key=lambda x: x['occupancy_rate'], reverse=True)
    
    return high_priority

print(filter_high_priority(combinado_data))