# Android_Atelier2

Lab 2
•	Créer une application Android avec une activité vide
–	Ajouter des Log  aux méthodes de Cycle de vie
–	Vérifier l’affichage des logs et leur ordre.
–	Ajouter des logs aux méthodes  (Log.i(TAG, "message"))
onSaveInstanceState et
onRestoreInstanceState()
–	Manipuler la tablette ou l’émulateur  pour que ces logs Apparaissent 

•	En reprenant l’activité précédente, ajouter un bouton (Une démonstration sera faite) dans son layout.
–	Ecouter le bouton, (définir une méthode déléguée à ce bouton)
–	Créer une autre activité  Activity2
–	Démarrer Activity2 au clic sur le bouton.

•	Essayer de démarrer l’appareil photo à la place de l’activité 2
–	Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
•	Passer une message sous forme de chaine de caractère à l’activité 2 afficher-le !
•	Ajouter un bouton à l’activité 2 qui permet de la fermer. (appeler la méthode finish())
•	En fermant l’activité 2, retourner un message à l’activité 1.
•	Créer 2 fragments dans l’activité 2
•	Logger (Log.i(TAG, "message")) les méthodes de cycle de vie d’un des deux fragments.


