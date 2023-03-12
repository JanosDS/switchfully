## Using Postman to make calls to our secured app

Fire up your app and try to make a call to ``http://localhost:8080/pets`` with Postman. You'll see that the response is a status 401, which means ``unauthorized``. We need a way to authenticate ourselves to make this call.

### Getting authenticated

As we saw in the previous codelab, our app expects a ``jwt`` from us which it will use to determine if we have access or not to specific methods. We first will have to make a call to a specific endpoint provided by Keycloak. We will provide the necessary
information to authenticate ourselves with Keycloak. If done correctly, Keycloak will respond with a token which we can use to get access to our endpoint.

- Make a new request in Keycloak. We will use this to get our token, so you can call it ``getToken``. It will be a POST request to [https://keycloak.switchfully.com/auth/realms/<YourRealmName>/protocol/openid-connect/token](https://keycloak.switchfully.com/auth/realms/Petinder-feb2022/protocol/openid-connect/token).
- In the body of this request, pass on the following key/value information as ``x-www-form-urlencoded``:
  - username | yourUsername
  - password | yourPassword
  - grant_type | password (literally password, don't change this with your own password)
  - client_id | yourClientId
  - client_secret | yourClientSecret
- Click send, and you should receive a response which has all kinds of information. We are interested in the ``access_token``. Copy this!
- Go to [jwt.io](https://jwt.io) and paste it. You'll see the decoded version of this token, and it will contain the information our app needs.

### Making our call

Now that we have our access token, we can go back to our initial request.

- Make a GET request to ``http://localhost:8080/pets``
- Go to the ``Authorization`` tab and choose ``Bearer Token`` as a type.
- Paste your token in the field to the right.
- Click send and the endpoint should now grant you access, responding with a nice list of pets!

Congratulations! Your app is now fully secured. You configured a Keycloak client, implemented the necessary code to enable your app to secure itself through ``jwt`` tokens issued by Keycloak and tested it through Postman. If you want to, you can add more roles in Keycloak and map them to different users. Experiment by adding custom endpoints and secure those with other roles!

