using UnityEngine;
using System.Collections;


public class AsaEstragada : MonoBehaviour {

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
		if (VidaDaNave.ContadorDeVida < 4) {
			transform.eulerAngles = new Vector3 (-110, -450, -360);
		}
	}
}
