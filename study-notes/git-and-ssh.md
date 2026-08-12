# Git and SSH

## SSH vs HTTPS

SSH (Secure Shell) and HTTPS (HyperText Transfer Protocol Secure) are both used for secure communication, but they are commonly used for different purposes when working with Git repositories.

### SSH

* SSH provides secure remote access and authentication.
* It can be used to securely interact with Git repositories.
* SSH commonly uses a pair of cryptographic keys:

  * **Public key**
  * **Private key**
* The public key can be shared with a service such as GitHub.
* The private key must be kept secret.
* Once configured, SSH allows authentication without entering a password every time.

### HTTPS

* HTTPS provides secure communication between a client and a web server.
* It uses **TLS (Transport Layer Security)** to protect communication.
* GitHub repositories can also be accessed using HTTPS.

## SSH Key Pair

An SSH key pair consists of:

### Public Key

* Can be safely shared.
* It is added to the service that needs to authenticate the user.
* GitHub can use the public key to verify that a connection is associated with the corresponding private key.

### Private Key

* Must remain secret.
* Should never be shared or uploaded to GitHub.
* It is stored securely on the user's computer.

## Basic Authentication Flow

```text
User's Computer
      |
      | SSH connection
      ↓
   GitHub
      |
      | Verifies public/private key pair
      ↓
Authenticated connection
```

## SSH vs HTTPS — Key Difference

| Feature            | SSH                                     | HTTPS                    |
| ------------------ | --------------------------------------- | ------------------------ |
| Main purpose       | Secure authentication and remote access | Secure web communication |
| GitHub usage       | Repository authentication               | Repository access        |
| Security mechanism | SSH key pair                            | TLS                      |
| Credentials        | Public/private key                      | HTTPS authentication     |

## Important Points to Remember

* SSH = secure remote access and authentication.
* HTTPS = secure communication over the web.
* Public key = can be shared.
* Private key = must remain secret.
* SSH keys allow authentication without repeatedly entering a password.
