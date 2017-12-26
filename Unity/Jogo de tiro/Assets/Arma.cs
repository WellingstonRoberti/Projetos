using UnityEngine;
using System.Collections;

public class Arma : MonoBehaviour {

	public GameObject bala;
	public Transform cano;
	public static int municao;
	float tempoDaBala;
	//bool aux;
	void Start () 
	{
		municao = 8;
		//aux = false;
	}
	void OnGUI(){

		GUI.Label (new Rect (1340, 550, 100, 100), "8/" + municao);

	}
	// Update is called once per frame
	void Update ()
	{
		
		
		if (municao > 0) {
			if (Input.GetKeyDown (KeyCode.Mouse0)) {
				Instantiate (bala, cano.position, cano.rotation);
				municao--;
			}
		} else if (municao == 0) {
			tempoDaBala = tempoDaBala + Time.deltaTime;
			if (tempoDaBala > 1) {
				municao = 8;
				tempoDaBala = 0;
			}
				
		}
		/*if (Input.GetKeyDown (KeyCode.R)) {
			aux = true;
			while (aux == true) {
				tempoDaBala = tempoDaBala + Time.deltaTime;
				if (tempoDaBala > 1) {
					municao = 8;
					tempoDaBala = 0;
					aux = false;
				}
			}
		}*/

	}
	
}

