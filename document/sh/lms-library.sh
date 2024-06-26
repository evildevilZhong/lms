#!/usr/bin/env bash
app_name='lms-library'
docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi `docker images | grep none | awk '{print $3}'`
echo '----rm none images----'
docker run -p 8080:8080 --name ${app_name} \
--link mysql:db \
--link redis:redis \
-e TZ="Asia/Shanghai" \
-v /etc/localtime:/etc/localtime \
-v /mydata/app/${app_name}/logs:/var/logs \
-d lms/${app_name}:1.0-SNAPSHOT
echo '----start container----'