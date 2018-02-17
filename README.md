Vybral som si moznost: II. SOAP webservice (od WSDL ku kódu)
Implementoval som metodu pre pridanie predmetu.

WSDL sa nachadza tu: "kopr-ajs/src/ajs.wsdl"
-WSDL som vytvoril klikanim pomocou pluginu v eclipse a dopisanim(upresnenim) par veci
-v priecinku kopr-ajs sa nachadzaju subory generateServer a generateClient, kde su prikazy, 
	ktore som pouzil na vygenerovanie klientskej a serverovskej casti
	
SQLdump
	-na tejto ceste: "kopr-ajs/ajs_subject.sql"
	
Server
	-vsetky triedy servera sa nachadzaju v package sk.kopr.ajs 
	-trieda Server obsahuje main a spusta server
	-trieda DefaultAJSService je implementaciou AJSService
	-SubjectDao je interface a SubjectMysqlDao jeho implementaciou
	-Factory obsahuje udaje na databazu, ktore su natvrdo v kode
	
Klient
	-vsetky triedy su v package sk.kopr.ajs.klient
	-Client je spustitelna trieda, ktora obsahuje jednoduchu poziadavku o pridanie predmetu,
	ktory sa dvakrat skusi pridat (1. krat sa prida	2.krat vyhodi exception, ze uz taky existuje)
	
JUnit
	-otestovanie jedinej metody addSubject sa nachadza v package test.sk.kopr.ajs v triede SubjectMysqlDaoTest
