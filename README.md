# Epic EI Connector

The Epic [connector](https://docs.wso2.com/display/EI640/Working+with+Connectors) allows you to access the [Epic FHIR](https://open.epic.com/Clinical/Patient) APIs through WSO2 EI. 
Epic connector currently supports the DSTU 2 Final (1.0.2) version of the FHIR standard.

## Compatibility
|      Connector version         | Epic API version    |Supported WSO2 EI version|
| ------------- | -----------|-------|
| 1.0.0    |   DSTU2    | EI 6.4.0 |


## Getting Started

1. Follow this [Documentation](https://docs.wso2.com/display/EI640/Working+with+Connectors+via+the+Management+Console) to add and enable the connector via the Management Console in your EI instance.
2. For more information on using connectors and their operations in your EI configurations, see [Using a Connector](https://docs.wso2.com/display/EI640/Using+a+Connector).
3. If you want to work with connectors via EI tooling, see [Working with Connectors via Tooling](https://docs.wso2.com/display/EI640/Working+with+Connectors+via+Tooling).

###### Configuring the connector operations
To get started with epic connector and their operations, see [Configuring Epic Operations](docs/config.md).

## Building From the Source
If you want to build Epic connector from the source code:
1. Get a clone or download the source from [github](https://github.com/wso2-extensions/esb-connector-epic).
2. Run the following Maven command from the `esb-connector-epic` directory: `mvn clean install`.
3. Epic connector zip will be created under `esb-connector-epic/target` directory.

## How You Can Contribute
As an open source project, WSO2 extensions welcome contributions from the community.
Check the [issue tracker](https://github.com/wso2-extensions/esb-connector-epic/issues) for open issues that interest you. We look forward to receiving your contributions.