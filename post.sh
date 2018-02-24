#!/bin/bash

while true
do
	curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d \
    '{"string1":"string1","string2":"string2","string3":"string3","string4":"string4","coll1":[{"string5":"string5","string6":"string6"},{"string7":"string7","string8":"string8"}]}' \
	'http://127.0.0.1:3000/spec/records' >> /dev/null 2>&1
done