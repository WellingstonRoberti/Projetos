using UnityEngine;
using System.Collections;
using UnityEngine.SceneManagement;

public class Scena : MonoBehaviour {

	// Use this for initialization
	void Start () {
	
	}
	public void voltar(){
		SceneManager.LoadScene ("jogoAviao");
	}
	// Update is called once per frame
	void Update () {
	
	}
}
