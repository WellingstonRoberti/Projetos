using UnityEngine;
using System.Collections;

public class Explosao : MonoBehaviour {

	// Use this for initialization
	public GameObject explosao;
	public Transform posicaoDoMeteoro;

	void Start () 
	{
		InvokeRepeating ("spawn", 0.0f, 20.0f);
	}
	void spawn() {
		
	}

	// Update is called once per frame
	void Update () {

	}
}