

class DSU {
    int[] p, r;
    DSU(int n) {
        p = new int[n];
        r = new int[n];
        for (int i = 0; i < n; i++) p[i] = i;
    }
    int find(int x) {
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
    boolean unite(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return false;
        if (r[a] < r[b]) {
            int temp = a; a = b; b = temp;
        }
        p[b] = a;
        if (r[a] == r[b]) r[a]++;
        return true;
    }
}

class Solution {
    static class EData {
        int u, v, w;
        EData(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public int secondMST(int V, int[][] edges) {
        int E = edges.length;
        EData[] e = new EData[E];

        for (int i = 0; i < E; i++)
            e[i] = new EData(edges[i][0], edges[i][1], edges[i][2]);

        Arrays.sort(e, (a, b) -> a.w - b.w);

        DSU d1 = new DSU(V);
        ArrayList<Integer> mstIndex = new ArrayList<>();
        int mstWeight = 0;

        for (int i = 0; i < E; i++) {
            if (d1.unite(e[i].u, e[i].v)) {
                mstWeight += e[i].w;
                mstIndex.add(i);
            }
        }

        if (mstIndex.size() != V - 1) return -1;

        int answer = Integer.MAX_VALUE;

        for (int skip : mstIndex) {
            DSU d2 = new DSU(V);
            int curWeight = 0;
            int used = 0;

            for (int i = 0; i < E; i++) {
                if (i == skip) continue;
                if (d2.unite(e[i].u, e[i].v)) {
                    curWeight += e[i].w;
                    used++;
                    if (curWeight >= answer) break;
                }
            }

            if (used == V - 1 && curWeight > mstWeight)
                answer = Math.min(answer, curWeight);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}
