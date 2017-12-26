using UnityEngine;
using System.Collections;
using UnityEngine.SceneManagement;

public class win : MonoBehaviour {

	// Use this for initialization
	void Start () {
	
	}
	void OnTriggerEnter(Collider other){
		if (other.gameObject.tag == "ganhei") {
			SceneManager.LoadScene ("ganhei");
		}
			
	}
	// Update is called once per frame
	void Update () {
	
	}
}
