using UnityEngine;
using System.Collections;

public class FogoSmoke : MonoBehaviour {

	public GameObject Fogo;
	public GameObject Smoke;
	public Transform Motor;
	int control;
	void Start () 
	{
		control = 0;
	}

	// Update is called once per frame
	void Update () 
	{
		if (VidaDaNave.ContadorDeVida == 2) {
			control++;
		}
		if (control == 1) {
			Instantiate (Fogo, Motor.position, Motor.rotation);
			Instantiate (Smoke, Motor.position, Motor.rotation);
		}
	}
}