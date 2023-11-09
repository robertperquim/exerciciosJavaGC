SELECT cli.id_cliente, cli.nome AS nome_do_cliente
FROM Clientes cli
LEFT JOIN Pedidos ped ON cli.id_cliente = ped.cliente_id AND ped.data_pedido >= (CURRENT_DATE - INTERVAL '6 months')
WHERE ped.id_pedido IS NULL;