using UnityEngine;
using System.Collections;
using UnityEngine.SceneManagement;

public class Pedra : MonoBehaviour {
	public GameObject explosao;
	public Transform posicaoDoMeteoro;
	int vidaPedra;
	public Rigidbody pedra;
	// Use this for initialization
	void Start () {
		pedra = transform.GetComponent<Rigidbody> ();
		vidaPedra = 1;
	}
	void OnTriggerEnter(Collider outro){
		if (outro.gameObject.tag == "bala") {
			vidaPedra--;
		}
	}
	// Update is called once per frame
	void Update () {
		if (transform.position.z < -20) {
			Destroy (gameObject);
		}
		if (vidaPedra == 0) {
			Destroy (gameObject);
			Instantiate (explosao, posicaoDoMeteoro.position, posicaoDoMeteoro.rotation);
		}
		pedra.velocity = -transform.forward * 5;
	}
}
