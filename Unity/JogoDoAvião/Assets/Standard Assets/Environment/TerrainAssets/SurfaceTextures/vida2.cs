using UnityEngine;
using System.Collections;

public class vida2 : MonoBehaviour {
	// Use this for initialization
	void Start () {
	}
	
	// Update is called once per frame
	void Update () {
		if (Aviao.vida == 2)
			Destroy (gameObject);
	}
}
