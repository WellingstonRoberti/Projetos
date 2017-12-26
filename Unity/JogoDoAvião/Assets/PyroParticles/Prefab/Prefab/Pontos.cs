using UnityEngine;
using System.Collections;
using UnityEngine.UI;

public class Pontos : MonoBehaviour {

	// Use this for initialization
	Text txt;
	// Use this for initialization
	void Start () {
		txt = gameObject.GetComponent<Text>(); 
	}

	// Update is called once per frame
	void Update () {
		
		txt.text="Pontos: " + Aviao.pontos;
		
	}
}

