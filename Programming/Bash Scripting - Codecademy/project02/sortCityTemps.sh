#!/bin/bash

cities=("California" "Sydney" "Delhi" "Tokyo")
> temperatures.txt

for city in ${cities[@]}
do
	sleep 1
	./weather.sh -s $city | sed 's/+//' | sed 's/°C//' >> temperatures.txt
done

sort -k2 -r temperatures.txt > sorted_temps.txt	
