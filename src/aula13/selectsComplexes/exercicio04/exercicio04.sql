SELECT prod.nome_produto AS detalhes_pedido, COUNT(dped.produto_id) AS quant_pedidos FROM produtos prod
INNER JOIN detalhesdopedido dped ON prod.id_produto = dped.produto_id
GROUP BY detalhes_pedido
ORDER BY quant_pedidos DESC;