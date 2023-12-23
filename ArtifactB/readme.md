Question4:

Spring web:
Spring Web Services (Spring-WS) is focused on creating document-driven Web services.
allowing for the creation of flexible web services using one of the many ways to manipulate XML payloads

Spring Data JPA:
makes it easy to easily implement JPA-based (Java Persistence API) repositories. It makes it easier to build Spring-powered applications that use data access technologies.

H2 Database:
a fast in-memory database

Spring boot Debeloper tools:
an additional set of tools that can make the application development experience a little more pleasant.

Thymeleaf:
a modern server-side Java template engine for both web and standalone environments.

hybernate:
Hibernate is a library for object/relation mapping (ORM)


Etape 13:
1) il s'agit de GetMapping("/gretting")
2) dans le return "greeting" il suffit de changer le string retourné 
3) il faut changer dans le code @RequestParam(name="nameGet",...) par @RequestParam(name="name",...) pour que l'url localhost:8080/greeting?name=ENSIM fonctionne
nous envoyons le nom dans le lien avec ?name=ENSIM

Etape 17:
une Table Address est ajouter dans l'arborescence a droite de l'application avec ces valeurs et sa sequences associés

Etape 18:
Hibernate permet de generer la table avec une classe utilisant les conventions JAVA Beans

Etape 20:
avec la requete SELECT * FROM Address on obtien bien nos 2 address et leurs données

Etape 23:
Autowired permet le lien automatique entre le bean address repository et l'AddressController

Etape 27:

Oui en modifiant le code html on le fait avec un fragment Thymeleaf comme demander dasn l'Etape 28

Etape 30:
Pour ajouter Bootstrap on rajoute dans les pages HTML :
'<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
crossorigin="anonymous">'