# Configuring Epic Operations
[[Initializing the connector]](#initializing-the-connector)[[Additional Information]](#additional-information)

## Initializing the connector
To use the Epic connector, add the <epic.init> element in your configuration before carrying out any Epic operations.
This <epic.init> element authenticates the user using OAuth2 authentication to access the Epic registered client applications.
For more information on authorizing requests in Epic, see [API Doc](https://open.epic.com/Tutorial/OAuth).


**init**
```xml
<epic.init>
    <base>{$ctx:base}</base>
    <accessToken>{$ctx:accessToken}</accessToken>
</epic.init>
```
**Properties**
* baseUrl: The API URL to access the endpoint. Eg:<https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/>
* accessToken: Access token obtained when using Epic registered applications.

> Note: Access token is not necessary when sandbox is used.

## Additional Information

Be sure to add and enable the following Axis2 configurations in the <EI_HOME>/conf/axis2/axis2.xml file.

Required message formatters

**messageFormatters**
```xml
<messageFormatter contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamFormatter"/>
```
Required message builders

**messageBuilders**
```xml
<messageBuilder contentType="application/json+fhir" class="org.apache.synapse.commons.json.JsonStreamBuilder"/>
```
Now that you have configured the Epic connector,  check [Working with the Epic Connector](operation.md) to perform various operations using the connector.
