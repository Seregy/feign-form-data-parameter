## Feign form data parameter example

This is an example application for reproducing the issue with Feign/Spring Cloud OpenFeign passing
parameters annotated with `@RequestParam` as query params instead of parts in `multipart/form-data`
requests.

Either check out the test scenario in `ServerApiClientTest` or launch the applications directly.

To test with real applications, start the Java application(`FeignFormDataParameterApplication`) and the node server(`app.js`).
Then send some requests with a file:

1. Directly to the node server:
```shell
curl --location 'http://127.0.0.1:8090/server/resources' \
--form 'file=@"/Users/user/Downloads/file.txt"' \
--form 'category="server-category"' \
--form 'priority="3"'
```

2. Through the Feign client:
```shell
curl --location 'http://127.0.0.1:8080/client/resources' \
--form 'file=@"/Users/user/Downloads/file.txt"' \
--form 'category="client-category"' \
--form 'priority="2"'
```
