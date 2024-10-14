#!/bin/bash

#Accept no of cities
echo "Enter the number of cities:"
read nc

#Accept city names one by one
cities=()
i=0
while [ $i -lt $nc ]
do
	echo "Enter city $((i+1)):"
	read city
	cities+=("$city")
	((i++))
done

#Fetch weather details & display
for city in "${cities[@]}"
do 
	data=$(curl -s "wttr.in/$city?format=%C+%f+%w+%p+%P+%u+%T+%Z")
	echo "	$city: 	$data"
done | sort -k8 #| ./qrify.sh -m
