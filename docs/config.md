# Configuring Epic Operations
[[Initializing the connector]](#initializing-the-connector)[[Additional Information]](#additional-information)

## Initializing the connector
To use the Epic connector, add the <Epic.init> element in your configuration before carrying out any Epic operations.

**init**
```xml
<Epic.init>
    <base>{$ctx:base}</base>
</Epic.init>
```
**Properties**
* baseUrl: The API URL to access the endpoint. Eg:<https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/>

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
Now that you have connected to cerner connector,  check [Working with the Epic Connector](operation.md) to perform various operations with the connector.
