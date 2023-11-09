SELECT prod.categoria AS nome_da_categoria, SUM(det.quantidade) AS total_vendas
FROM Produtos prod
INNER JOIN DetalhesDoPedido det ON prod.id_produto = det.produto_id
GROUP BY prod.categoria;