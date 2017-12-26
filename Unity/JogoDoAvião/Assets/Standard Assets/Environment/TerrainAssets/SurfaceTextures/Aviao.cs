using UnityEngine;
using System.Collections;
using UnityEngine.SceneManagement;


public class Aviao : MonoBehaviour {
	public GameObject explosao;
	public Transform posicaoDoAviao;
	public static int pontos;
	public static int vida;
	// Use this for initialization
	void Start () {
		vida = 3;
		pontos = 0;
	}
	void OnTriggerEnter(Collider outro){
		if (outro.gameObject.tag == "Meteoro") {
			vida--;
		}
	}
	// Update is called once per frame
	void Update () {
		if (vida == 0) {
			Destroy (gameObject);
			Instantiate (explosao, posicaoDoAviao.position, posicaoDoAviao.rotation);
			SceneManager.LoadScene ("perdeu");
		}
	}
}
