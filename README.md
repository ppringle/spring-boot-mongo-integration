# spring-boot-mongo-integration

To initialize a Docker container running MongoDB execute the following command:

```
docker-compose -f ./docker/docker-compose.yml up
```

To interact with the MongoDB instance using the internal **mongosh** run the following commands:

```
docker exec -it mongo-db /bin/bash
mongosh "mongodb://root:example@mongodb:27017"
```

The output of the last command above should output content resembling the following:

```
root@7614fb66395d:/# mongosh "mongodb://root:example@mongodb:27017"
Current Mongosh Log ID: 63e6cfb8cce46e1ecd8ea2b6
Connecting to:          mongodb://<credentials>@mongodb:27017/?directConnection=true&appName=mongosh+1.6.2
Using MongoDB:          6.0.4
Using Mongosh:          1.6.2

For mongosh info see: https://docs.mongodb.com/mongodb-shell/

------
   The server generated these startup warnings when booting
   2023-02-10T22:10:19.104+00:00: Using the XFS filesystem is strongly recommended with the WiredTiger storage engine. See http://dochub.mongodb.org/core/prodnotes-filesystem
   2023-02-10T22:10:19.857+00:00: vm.max_map_count is too low
------

------
   Enable MongoDB's free cloud-based monitoring service, which will then receive and display
   metrics about your deployment (disk utilization, CPU, operation statistics, etc).
   
   The monitoring data will be available on a MongoDB website with a unique URL accessible to you
   and anyone you share the URL with. MongoDB may use this information to make product
   improvements and to suggest MongoDB products and deployment options to you.
   
   To enable free monitoring, run the following command: db.enableFreeMonitoring()
   To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
------

test> 

```

You should then be able to interact with the running MongoDB server instance.

