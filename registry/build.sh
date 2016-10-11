#!/bin/bash

export base_path="/var/data/docker-registry"
export srv_path="$base_path/srv"
export web_path="$base_path/web"

mkdir -p $srv_path/data
mkdir -p $web_path/data
mkdir -p $srv_path/conf
mkdir -p $web_path/conf

cp conf/registry-srv/* $srv_path/conf
cp conf/registry-web/* $web_path/conf

openssl req \
    -new \
    -newkey rsa:4096 \
    -days 365 \
    -subj "/CN=localhost" \
    -nodes \
    -x509 \
    -keyout auth.key \
    -out $srv_path/conf/auth.cert

openssl rsa -in auth.key -out $web_path/conf/auth.key
rm auth.key

chown -R ahernandez: $base_path
