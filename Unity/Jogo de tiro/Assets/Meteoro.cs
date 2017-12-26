using UnityEngine;
using System.Collections;

public class Meteoro : MonoBehaviour {

	public GameObject explosao;
	public Transform lugarDaExplosao;
	Vector3 distanciaHeroi;
	float velocidade;
	int vidaDoMeteoro;
	void Start () 
	{
		vidaDoMeteoro = 3;
	}
	void OnTriggerEnter(Collider other)
	{
		vidaDoMeteoro--;
		if (other.gameObject.tag == "Escudo") {
			Escudo.Escudao--;
			Destroy (gameObject);
			Instantiate (explosao, lugarDaExplosao.position, lugarDaExplosao.rotation);
		}
		if (other.gameObject.tag == "Nave") {
			VidaDaNave.ContadorDeVida--;
			Destroy (gameObject);
		}
	}
	// Update is called once per frame
	void Update () 
	{
		if (vidaDoMeteoro == 0) {
			Destroy (gameObject);
			Instantiate (explosao, lugarDaExplosao.position, lugarDaExplosao.rotation);

		}
		velocidade = 1 * Time.deltaTime;
		distanciaHeroi = corpo.posicaoHeroi - transform.position;

		if (distanciaHeroi.x > 0) {
			transform.Translate (velocidade, 0, 0);
		} else 
		{
			transform.Translate (-velocidade, 0, 0);
		}

		if (distanciaHeroi.z > 0) {
			transform.Translate (0, 0,velocidade);
		} else 
		{
			transform.Translate (0, 0,-velocidade);
		}

		if (distanciaHeroi.y > 0) {
			transform.Translate (0, velocidade,0);
		} else 
		{
			transform.Translate (0,-velocidade,0);
		}
	}
}
