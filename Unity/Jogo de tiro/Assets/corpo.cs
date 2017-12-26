using UnityEngine;
using System.Collections;

public class corpo : MonoBehaviour {

	public static int Score;
	public static Vector3 posicaoHeroi;
	float tempoDeJogo;
	void Start () {
		Score = 0;
	}
	void OnGUI(){

		GUI.Label (new Rect (10, 10, 100, 100), "" + tempoDeJogo);
		GUI.Label (new Rect (1340, 10, 100, 100), "" + Score);
		GUI.Label (new Rect (670, 250, 100, 100), "+");

	}
	// Update is called once per frame
	void Update () 
	{
		tempoDeJogo = tempoDeJogo + Time.deltaTime;
		posicaoHeroi = transform.position;

	}
}
