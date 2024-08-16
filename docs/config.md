# Configuring Epic Operations
[[Pre-requisites]](#pre-requisites)[[Initializing the connector]](#initializing-the-connector)

## Pre-requisites

Before you start configuring the connector, you need to have an Epic account and an Epic app. You can create an Epic app in sandbox by following the documentation: [Registering an app](https://fhir.epic.com/Documentation?docId=epiconfhirrequestprocess&section=devclient).

## Initializing the connector
To use the Epic connector, you need to configure the init operation before carrying out any Epic operations. You need the client id of the Epic app and the private key here and set the Base URL and Token endPoint.

**init**

**Properties**
* base: The API URL to access the endpoint. For sandbox:<https://fhir.epic.com/interconnect-fhir-oauth/api/FHIR/R4/>
* tokenEndpoint: OAuth2 token endpoint of Epic system. For sandbox: https://fhir.epic.com/interconnect-fhir-oauth/oauth2/token
* clientId: The client id of the Epic app.
* privateKey: The private key of the Epic app.
* enableUrlRewrite : Enable/disable URL rewrite in the response payload. Default value is `false`.
