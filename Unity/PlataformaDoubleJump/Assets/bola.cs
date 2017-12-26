using UnityEngine;
using System.Collections;

public class bola : MonoBehaviour {
	public static int pontos;
	// Use this for initialization
	void Start () {
		pontos = 0;
	}
	void OnTriggerEnter(Collider other) {
		if(other.gameObject.tag == "pac"){
			Destroy(gameObject);
			pontos += 20;
		}
	}
	// Update is called once per frame
	void Update () {
	
	}
}
