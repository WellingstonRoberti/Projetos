using UnityEngine;
using System.Collections;




public class VidaDaNave : MonoBehaviour {

	public static int ContadorDeVida;
	// Use this for initialization
	void Start () {
		ContadorDeVida = 6;
	}
	
	// Update is called once per frame
	void Update () {
		print (ContadorDeVida);
		if(ContadorDeVida == 0){
			Destroy (gameObject);
	}
}
}