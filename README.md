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
