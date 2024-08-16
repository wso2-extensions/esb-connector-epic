# Epic FHIR Connector

The Epic [connector](https://docs.wso2.com/display/EI640/Working+with+Connectors) allows you to access the [Epic FHIR](https://fhir.epic.com/) APIs through WSO2 Micro Integrator (WSO2 EI). 
Epic connector currently supports the R4 version of the FHIR standard.

## Compatibility
| Connector version | Epic API version | Supported version  |
|-------------------|------------------|--------------------|
| 2.0.0             | R4               | EI 6.6.0, MI 4.2.0 |

###### Configuring the connector operations
To get started with the Epic connector and their operations, see [Configuring Epic Operations](docs/config.md).

## Building From the Source
Follow the steps given below to build the Epic connector from the source code:
1. Get a clone or download the source from [github](https://github.com/wso2-extensions/esb-connector-epic).
2. Run the following Maven command from the `esb-connector-epic` directory: `mvn clean install`.
3. Epic connector zip will be created under `esb-connector-epic/target` directory.

## How You Can Contribute
As an open source project, WSO2 extensions welcome contributions from the community.
Check the [issue tracker](https://github.com/wso2-extensions/esb-connector-epic/issues) for open issues that interest you. We look forward to receiving your contributions.