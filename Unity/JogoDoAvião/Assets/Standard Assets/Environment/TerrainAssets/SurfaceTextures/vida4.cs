using UnityEngine;
using System.Collections;

public class vida4 : MonoBehaviour {

	// Use this for initialization
	void Start () {

	}
	
	// Update is called once per frame
	void Update () {
		if (Aviao.vida == 0)
			Destroy (gameObject);
	}
}
