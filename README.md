# springbootwithsslenabled

## How to enable SSL for your spring boot application

Step 1: configure the below in your application.yml

    server:
      port: 8443
      ssl:
        key-alias: https-example
        key-store-type: JKS
        key-password: changeit
        key-store: classpath:https-example.jks


step 2: generate a self signed certificate using keytool on the terminal


    keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks


To view the details of the certificate

    keytool -list -keystore https-example.jks
    
    
To view the details 

    keytool -list -v -keystore https-example.jks
    
    
## if you want to use pkcs12


instead of key-password we have to use key-store-password

    server:
      port: 8443
      ssl:
        key-alias: https-example
        key-store-type: pkcs12
        key-store: classpath:https-example-pkcs.jks
        key-store-password: changeit

steps to generate are the same as below

    keytool -genkey -alias https-example -storetype pkcs12 -keyalg RSA -keysize 2048 -validity 365 -keystore https-example-pkcs.jks
    
