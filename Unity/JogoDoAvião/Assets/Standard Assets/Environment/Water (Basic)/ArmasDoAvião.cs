using UnityEngine;
using System.Collections;

public class ArmasDoAvião : MonoBehaviour {


	public GameObject bala;
	public Transform Arma1;
	public Transform Arma2;

	// Use this for initialization
	void Start () {
	
	}
	// Update is called once per frame
	void Update () {
		if (Input.GetKeyDown (KeyCode.Space)) {
			Instantiate (bala, Arma1.position, Arma1.rotation);
			Instantiate (bala, Arma2.position, Arma2.rotation);
		}
	}
}
