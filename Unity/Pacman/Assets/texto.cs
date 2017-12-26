using UnityEngine;
using System.Collections;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class texto : MonoBehaviour {

	// Use this for initialization
	Text txt;
	// Use this for initialization
	void Start () {
		txt = gameObject.GetComponent<Text>(); 
	}

	// Update is called once per frame
	void Update () {

		txt.text="Pontos: " + bola.pontos + "\nTempo: " + (int)Time.time;
		if(bola.pontos == 4920){
			SceneManager.LoadScene ("Ganhou");
		}
		if((int)Time.time > 300){
			SceneManager.LoadScene ("Perdeu");
		}
	}
}