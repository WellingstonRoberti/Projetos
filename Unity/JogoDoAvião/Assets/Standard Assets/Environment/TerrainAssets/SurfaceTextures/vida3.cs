using UnityEngine;
using System.Collections;

public class vida3 : MonoBehaviour {

	// Use this for initialization
	void Start () {

	}
	
	// Update is called once per frame
	void Update () {
		if (Aviao.vida == 1)
			Destroy (gameObject);
	}
}
