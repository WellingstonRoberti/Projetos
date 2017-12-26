using UnityEngine;
using System.Collections;

public class Escudo : MonoBehaviour {
	public static int Escudao;
	// Use this for initialization
	void Start () {
		Escudao = 2;
	}
	// Update is called once per frame

	void Update () {
		if (Escudao == 0) {
			Destroy (gameObject);
		}
	}
}
